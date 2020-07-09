from singleton_meta import singleton_metaclass


def main():
    class test_class(metaclass=singleton_metaclass):
    c = 3
    
    def set_c(self):
        self.c = 4

    def get_c(self):
        return self.c

    ob1 = test()
    ob2 = test()
    print(ob1 == ob2)
    ob1.set_c()
    print(ob1.get_c(), ob2.get_c())
    print(ob1 == ob2)


if __name__ == "__main__":
    main()