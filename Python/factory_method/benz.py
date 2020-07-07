from car import Car


class Benz(Car):
    def __init__(self):
        self.name = "Benz"

    def getName(self):
        return self.name