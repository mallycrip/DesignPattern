from abc import ABCMeta, abstractmethod


class KeyboardInterface(metaclass=ABCMeta):
    @abstractmethod
    def getName(self):
        pass