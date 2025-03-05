my_list = []

int_list = [1, 2, 3, 4]
print(int_list)

str_list = ["Dogukan", "Tugce", "Joe"]
print(str_list)

int_and_str_list = [1, "Ankara", 9, 6, "Gelibolu"]
print(int_and_str_list)

print()

data_tuple = (1, "kodla", "2")
data_list = list(data_tuple)
print(data_list)

print()

zero_table = [0] * 5
print(zero_table)

print()

my_list = []
my_list.append(2)
print(my_list)

my_list.insert(0, "Dre")
print(my_list)

my_list.extend([5, 6, "Go"]) # multi add
print(my_list)

my_list[0] = 1
print(my_list)

my_list.remove(1)
print(my_list)

my_list.pop(-1) # default = -1
print(my_list)

del my_list[1]
print(my_list)

for item in my_list:
    print(item)