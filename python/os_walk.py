import os

for (path, dir, files) in os.walk(input()) :
    for x in files :
        ext = os.path.splitext(x)[-1]
        if ext == '.py' :
            print("%s/%s" % (path, x))

ad ='사실 이것도 이슬람권 전체에 보편화된 풍습은 아니고, 오직 튀르크 문화권에서만 발견되는 풍습이다. 그것도 왕이나 대영주 정도나 할 수 있던 일이었고, 애초에 하렘제도의 시작은 성적쾌락이 아니라 공평한 경쟁(?)을 통한 유능한 자식의 계승을 목적으로 한 것이라...'
