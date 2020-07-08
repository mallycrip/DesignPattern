from abc import ABCMeta, abstractmethod


class MonitorInterface(metaclass=ABCMeta):
    @abstractmethod
    def getName(self):
        pass