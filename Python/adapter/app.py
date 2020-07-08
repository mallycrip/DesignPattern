from chef_interface import Chef

from chefs.meat_chef import MeatChef
from chefs.coldfood_chef import ColdfoodChef
from chefs.baker import Baker
from adapter import ChefAdapter


def main():
    meat_chef: Chef = MeatChef()
    cold_chef: Chef = ColdfoodChef()
    baker: Chef = ChefAdapter(Baker())

    chefs = [meat_chef, cold_chef, baker]

    for chef in chefs:
        print("주문 한 음식은 : ", chef.cook()) 




if __name__ == "__main__":
    main()