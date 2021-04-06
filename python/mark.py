#marks2.py

#marks = [90, 25, 67, 45, 80]
#number = 0

#for man in marks :
#    number += 1
#    if man >= 60 :
#        print(f'Student {number} Congratulations!')
#
#    else : continue

marks = [90, 25, 67, 45, 80]
for number in range(len(marks)) :
     if marks[number] < 60 : continue
     print(f'Student {number + 1} Congratulations!')
