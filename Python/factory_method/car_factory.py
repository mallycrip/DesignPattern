from car import Car
from bmw import Bmw
from benz import Benz


class CarFactory:
    @staticmethod
    def getCar(i):
        if i == 1: return Bmw()
        elif i == 2: return Benz() 