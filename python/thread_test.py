#thread_tset.py

import time

def task() :
    for i in range(5) :
        time.sleep(1)
        print(f'working : {i}\n')

print('start')

for i in range(5) : task()

print('end')
