# 용어
- ### pull
- ### push
- ### fetch
- ### branch
- ### checkout
- ### rebase
- ### reset
  - keep(--mixed)
  - delete(--hard)
- ### revert

- ### reset과 revert차이
```
git reset은 remote repository까지 컨트롤할 수 없습니다.
커밋 이력이 삭제되므로, remote와 싱크가 안맞아서 결국 push 할 수 없습니다.
따라서 이미 원격 저장소에 push를 한 상태에서 되돌리고 싶다면 git revert를 사용해야 합니다.
```

<br>

- ### synchronize
- ### cherry-pick 
  - rebase를(참조) 통하여 다른 브랜치의 전체 commit 내역을 복사해오지 않고 특정 commit 내역만을 가져오고 싶을 경우 cherry-pick을 사용한다
