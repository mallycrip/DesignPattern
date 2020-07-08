from abc import ABCMeta, abstractmethod


class Chef(metaclass=ABCMeta):
    @abstractmethod
    def cook(self): pass