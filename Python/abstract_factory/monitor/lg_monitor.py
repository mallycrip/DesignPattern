from monitor import MonitorInterface


class LGMonitor(MonitorInterface):
    def __init__(self):
        self._name = "LGMonitor"
    
    def get_name(self):
        return self._name