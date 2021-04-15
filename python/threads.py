# thread_test.py
import time

def long_task() :
    for i in range(5) :
        time.sleep(1)
        print('workingD%s\n' % i)

print('START')
fn
for i in range(5) :
    long_task()

print('END')

# thread_test.py
import threading

threads = []
for i in range(5) :
    t = threading.Thread(target = long_task)
    threads.append(t)

for t in threads :
    t.start()

print('END')
