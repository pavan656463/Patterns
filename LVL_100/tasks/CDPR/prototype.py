import tkinter as tk
from tkinter import messagebox

# Function to calculate the amount of water to add
def calculate_dilution():
    try:
        initial_concentration = float(entry_initial_concentration.get())
        desired_concentration = float(entry_desired_concentration.get())
        initial_volume = float(entry_initial_volume.get())
        
        if initial_concentration <= 0 or desired_concentration <= 0 or initial_volume <= 0:
            raise ValueError("Values must be greater than zero.")
        
        if desired_concentration >= initial_concentration:
            raise ValueError("Desired concentration must be less than the initial concentration.")
        
        # Calculate the final volume needed
        final_volume = (initial_concentration / desired_concentration) * initial_volume
        
        # Calculate the amount of water to add
        water_to_add = final_volume - initial_volume
        
        # Display the result
        label_result.config(text=f"Add {water_to_add:.2f} liters of water.")
        
    except ValueError as ve:
        messagebox.showerror("Input Error", str(ve))

# Create the main window
root = tk.Tk()
root.title("Dilution Calculator")

# Create and place labels and entries
tk.Label(root, text="Initial Concentration (%):").grid(row=0, column=0, padx=10, pady=5)
entry_initial_concentration = tk.Entry(root)
entry_initial_concentration.grid(row=0, column=1, padx=10, pady=5)

tk.Label(root, text="Desired Concentration (%):").grid(row=1, column=0, padx=10, pady=5)
entry_desired_concentration = tk.Entry(root)
entry_desired_concentration.grid(row=1, column=1, padx=10, pady=5)

tk.Label(root, text="Initial Volume (liters):").grid(row=2, column=0, padx=10, pady=5)
entry_initial_volume = tk.Entry(root)
entry_initial_volume.grid(row=2, column=1, padx=10, pady=5)

# Create and place the calculate button
btn_calculate = tk.Button(root, text="Calculate", command=calculate_dilution)
btn_calculate.grid(row=3, column=0, columnspan=2, padx=10, pady=10)

# Label to display the result
label_result = tk.Label(root, text="")
label_result.grid(row=4, column=0, columnspan=2, padx=10, pady=5)

# Start the main loop
root.mainloop()
