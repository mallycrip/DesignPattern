from chef_interface import Chef


class ColdfoodChef(Chef):
    def __init__(self):
        self.food = "Coldfood"

    def cook(self):
        return self.food