import requests
from bs4 import BeautifulSoup
import pandas as pd

# URLs of the webpages to scrape
base_url = "https://targetstudy.com/school/schools-in-bhopal.html"
page_url = "https://targetstudy.com/school/schools-in-bhopal.html?recNo="

# Headers to mimic a request from a browser
headers = {
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36"
}

# List to store all the extracted information across multiple pages
all_schools_data = []

def scrape_page(url):
    response = requests.get(url, headers=headers)
    if response.status_code == 200:
        soup = BeautifulSoup(response.text, 'html.parser')
        school_cards = soup.find_all('div', class_='card pmd-card college-card')
        for card in school_cards:
            school_name = card.find('h4').text.strip()
            
            # Extract address and phone number
            address_phone_p = card.find('p', class_='card-subtitle mt-0')
            address_phone_text = address_phone_p.get_text(separator="|").strip()
            
            # Split address and phone
            if "phone" in address_phone_text:
                address, phone = address_phone_text.split("phone", 1)
                address = address.strip()
                phone = phone.strip()
            else:
                address = address_phone_text.strip()
                phone = ""

            details = [li.text for li in card.find_all('li')]
            all_schools_data.append({
                "School Name": school_name,
                "Address": address,
                "Phone": phone,
                "Details": ', '.join(details)
            })
    else:
        print(f"Failed to retrieve the webpage at {url}. Status code:", response.status_code)

# Scrape the first page
scrape_page(base_url)

# Loop through subsequent pages with a jump of 25 until 300
for i in range(25, 301, 25):
    scrape_page(page_url + str(i))

# Convert the list of dictionaries into a DataFrame
df = pd.DataFrame(all_schools_data)

# Write the DataFrame to an Excel file
df.to_excel(r"C:\\Users\\pavan.k\\Desktop\\schools_in_bhopal.xlsx", index=False)

print("Data successfully written to 'schools_in_bhopal.xlsx'")
