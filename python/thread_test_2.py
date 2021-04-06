# thread_tset.py

import time
import threading

def task() :
    for i in range(5) :
        time.sleep(1)
        print(f'working : {i}\n')

print('start')

result = []

for i in range(5) :
    t = threading.Thread(target = task)
    result.append(t)

for t in result :
    t.start()
for t in result :
    t.join()

print('end')
