from computer_factory import ComputerInterface
from keyboard.lg_keyboard import LGKeyboard
from monitor.lg_monitor import LGMonitor


class LGComputerFactory(ComputerInterface):
    def get_monitor(self):
        return LGKeyboard()

    def get_keyboard(self):
        return LGMonitor()