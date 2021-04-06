# C:/doit/sub_dir_search.py
import os

def search(dir) :
    name = os.listdir(dir)
    for x in name :
        full = os.path.join(dir, x)
        print(full)

print(search(input()))
