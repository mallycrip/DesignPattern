from monitor import MonitorInterface


class SamsungMonitor(MonitorInterface):
    def __init__(self):
        self._name = "SamsungMonitor"
    
    def get_name(self):
        return self._name