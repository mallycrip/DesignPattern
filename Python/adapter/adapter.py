from chef_interface import Chef


class ChefAdapter(Chef):
    def __init__(self, chef_object):
        self.chef = chef_object

    def cook(self):
        return self.chef.bake()