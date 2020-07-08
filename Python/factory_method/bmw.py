from car import Car


class Bmw(Car):
    def __init__(self):
        self._name = "Benz"

    def getName(self):
        return self._name