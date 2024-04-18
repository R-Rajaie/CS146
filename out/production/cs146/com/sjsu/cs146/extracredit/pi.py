from decimal import Decimal, getcontext

def calculate_pi(decimal_places):
    getcontext().prec = decimal_places + 2
    pi = Decimal(0)
    numerator = Decimal(1)
    add_term = True

    for _ in range(decimal_places * 5):
        term = Decimal(1) / numerator
        if add_term:
            pi += term
        else:
            pi -= term
        numerator += Decimal(2)
        add_term = not add_term

    return pi * Decimal(4)

def main():
    decimal_places = 5000
    pi = calculate_pi(decimal_places)
    print("Pi to", decimal_places, "decimal places:", pi)

if __name__ == "__main__":
    main()