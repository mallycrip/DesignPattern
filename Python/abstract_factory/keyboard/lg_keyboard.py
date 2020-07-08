from keyboard import KeyboardInterface


class LGKeyboard(KeyboardInterface):
    def __init__(self):
        self._name = "LGKeyboard"
    
    def get_name(self):
        return self._name