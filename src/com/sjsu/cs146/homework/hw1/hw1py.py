# A phrase is a palindrome if,
# after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
# it reads the same forward and backward.
# Alphanumeric characters include letters and numbers.
# Given a string s, return true if it is a palindrome, or false otherwise.

s = "friirfe"
print(s + " is palindrome: ")

str = ""

for char in s:
    if char.isalnum():
        str += char.lower()

def palinLoop(str):
    if(len(str) <= 1):
        print("true")
        return
    if(str[0] != str[len(str) - 1]):
        print("false")
        return
    str = str[1:len(str) - 1]
    palinLoop(str)

palinLoop(str)