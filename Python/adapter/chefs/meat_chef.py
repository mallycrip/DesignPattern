from chef_interface import Chef


class MeatChef(Chef):
    def __init__(self):
        self.food = "Meat"

    def cook(self):
        return self.food