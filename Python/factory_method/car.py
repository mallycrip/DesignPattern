from abc import ABCMeta, abstractmethod

class Car(metaclass=ABCMeta):
    @abstractmethod
    def getName(self):
        pass