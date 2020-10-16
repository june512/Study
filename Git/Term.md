# 용어
- ### pull
- ### push
- ### fetch
- ### branch
- ### checkout
- ### rebase
- ### reset
> git reset을 명령어는 특정 커밋으로 되돌아갈 수 있는데, 되돌린 버전 이후의 버전들은 히스토리에서 삭제됩니다.

  - keep(--mixed)
  - delete(--hard)
  
- ### revert

> git revert는 reset처럼 특정 버전으로 되돌아갈 수 있지만, 되돌린 버전 이후의 버전들의 이력은 남아있다는 점에서 차이가 있습니다.

- ### reset과 revert차이
```
git reset은 remote repository까지 컨트롤할 수 없습니다.
커밋 이력이 삭제되므로, remote와 싱크가 안맞아서 결국 push 할 수 없습니다.
따라서 이미 원격 저장소에 push를 한 상태에서 되돌리고 싶다면 git revert를 사용해야 합니다.
```

<br>
___
<br>
- ### synchronize
- ### cherry-pick 
  - rebase를(참조) 통하여 다른 브랜치의 전체 commit 내역을 복사해오지 않고 특정 commit 내역만을 가져오고 싶을 경우 cherry-pick을 사용한다
