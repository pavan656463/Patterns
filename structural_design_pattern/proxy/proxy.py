# Existing system (Adaptee)
class OldGradingSystem:
    def convert_to_letter_grade(self, score):
        if score >= 90:
            return 'A'
        elif score >= 80:
            return 'B'
        elif score >= 70:
            return 'C'
        elif score >= 60:
            return 'D'
        else:
            return 'F'


# Target interface
class NewGradingSystem:
    def convert_to_letter_grade(self, score):
        pass


# Adapter
class GradeAdapter(NewGradingSystem):
    def __init__(self, old_system):
        self.old_system = old_system

    def convert_to_letter_grade(self, score):
        # Convert 0-100 scale to letter grade
        letter_grade = self.old_system.convert_to_letter_grade(score)
        return letter_grade


# Proxy method
def calculate_grade(score):
    adapter = GradeAdapter(OldGradingSystem())
    print("Your letter grade is:", adapter.convert_to_letter_grade(score))


# Usage
calculate_grade(60)  
