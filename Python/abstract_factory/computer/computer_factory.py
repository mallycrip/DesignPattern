from abc import ABCMeta, abstractmethod


class ComputerInterface(metaclass=ABCMeta):
    @abstractmethod
    def get_monitor(self):
        pass

    @abstractmethod
    def get_keyboard(self):
        pass