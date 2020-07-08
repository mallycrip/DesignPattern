from computer_factory import ComputerInterface
from keyboard.samsung_keyboard import SamsungKeyboard
from monitor.samsung_monitor import SamsungMonitor


class SamsungComputerFactory(ComputerInterface):
    def get_monitor(self):
        return SamsungMonitor()

    def get_keyboard(self):
        return SamsungKeyboard()