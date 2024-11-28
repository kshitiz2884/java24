class A:
    def fun1(self):
        print("Fun1")

class B:
    def fun1(self):
        print("Fun 2")

class C (A,B):
    def fun3():
        print("Fun 3")

child =C()
child.fun1()
child.fun1()
# child.fun3()