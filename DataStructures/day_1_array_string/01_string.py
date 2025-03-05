letter = "a"
print(letter)
print(type(letter))

print()

odd_quote = 'I\'m odd'
print(odd_quote)
even_quote = "I'm even"
print(even_quote)

print()

multi_line = """This is a multi-line string
that spans across multiple lines
"""
print(multi_line)

print()

string_with_index = "Hello, World!"
print(string_with_index[0])
print(string_with_index[-1])
print(string_with_index[0:5])
print(string_with_index[7:])


print()

# replace
string_to_replace = "Hello, World!"
print(string_to_replace.replace("World", "Python"))


print()

# strip
string_to_strip = "    Hello, World!  "
print(string_to_strip.strip())
print(string_to_strip.lstrip())
print(string_to_strip.rstrip())

print()

# split
string_to_split = "Hello, World!"
print(string_to_split.split(","))
print(string_to_split.split(" "))
print(string_to_split.split("o"))

print()

# join
string_to_join = ["Hello", "World!"]
print(" ".join(string_to_join))
print(", ".join(string_to_join))

print()

# concatenation and formatting
string1 = "Hello"
string2 = "World!"
print(string1 + " " + string2)
print(string1, string2)
print("{} {}".format(string1, string2))
print(f"{string1} {string2}")

print()


