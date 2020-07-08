from keyboard import KeyboardInterface


class SamsungKeyboard(KeyboardInterface):
    def __init__(self):
        self._name = "SamsungKeyboard"
    
    def get_name(self):
        return self._name