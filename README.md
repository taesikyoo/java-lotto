# java-lotto 게임

## 기능 구현 목록
- 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
- 로또 1장의 가격은 1000원이다.

---

### 1.1 전체 구입금액 입력
- [x] 숫자만 입력 가능
- [x] 1000원 이상이 아니면 예외 처리
- [x] 1000의 배수가 아닐 때 예외 처리

### 1.2 수동로또 개수 입력
- [x] 수동으로 구입할 로또 개수 입력 
- [x] 구입한 로또 개수를 계산해서 해당 개수 내 입력 가능 

### 1.3 수동로또 번호 입력
- [ ] 수동으로 구입한 로또 개수만큼 입력 가능
- [ ] 로또의 각 번호는 1~45 사이의 숫자
- [ ] 한 로또는 서로 다른 6개의 숫자를 가짐
- [ ] 로또 번호는 오름차순 정렬

### 2.1 수동 로또 발급
- [ ] 수동로또 개수만큼 로또 발급

### 2.2 자동 로또 발급
- [ ] 나머지 로또 개수를 계산해서 그 개수만큼 발급
- [x] 로또의 각 번호는 1~45 사이의 숫자
- [x] 한 로또는 서로 다른 6개의 숫자를 가짐
- [x] 로또 번호는 오름차순 정렬

### 3. 로또 출력
- [x] 구매 개수 출력
- [x] 로또번호를 한 줄에 1개씩 출력

--- 

### 4.1 당첨번호 입력
- [x] 1~45 사이의 숫자 6개를 입력
- [x] 쉼표를 기준으로 분류
- [x] 숫자를 입력하지 않은 경우(문자, 공백 등) 예외처리
- [x] 숫자가 6개 미만이거나 초과일 때 예외처리

### 4.2 보너스볼 입력
- [ ] 1~45 사이의 숫자 1개를 입력
- [ ] 숫자를 입력하지 않은 경우(문자, 공백 등) 예외처리

### 5. 당첨통계 계산
- [x] 당첨번호와 일치하는 로또를 검색
- [x] 3개 이상 일치하는 로또일 경우 통계치에 반영
- [ ] 당첨번호와 보너스번호가 일치하는 로또를 검색
- [ ] 5개가 일치하고 보너스볼이 일치할 때 통계치에 반영
- [x] 수익률을 계산

### 6. 당첨통계 출력
- [x] "n개 일치 - m개" 형식으로 출력
- [x] 총 수익률 출력

## 게임 예시
```
구입금액을 입력해 주세요.
14000

수동으로 구매할 로또 수를 입력해 주세요.
3

수동으로 구매할 번호를 입력해 주세요.
8, 21, 23, 41, 42, 43
3, 5, 11, 16, 32, 38
7, 11, 16, 35, 36, 44

수동으로 3장, 자동으로 11개를 구매했습니다.
[8, 21, 23, 41, 42, 43] 
[3, 5, 11, 16, 32, 38] 
[7, 11, 16, 35, 36, 44] 
[1, 8, 11, 31, 41, 42] 
[13, 14, 16, 38, 42, 45] 
[7, 11, 30, 40, 42, 43] 
[2, 13, 22, 32, 38, 45] 
[23, 25, 33, 36, 39, 41] 
[1, 3, 5, 14, 22, 45] 
[5, 9, 38, 41, 43, 44] 
[2, 8, 9, 18, 19, 21] 
[13, 14, 18, 21, 23, 35] 
[17, 21, 29, 37, 42, 45] 
[3, 8, 27, 30, 35, 44]

지난 주 당첨 번호를 입력해 주세요.
1, 2, 3, 4, 5, 6
보너스 볼을 입력해 주세요.
7

당첨 통계
---------
3개 일치 (5000원)- 1개 
4개 일치 (50000원)- 0개 
5개 일치 (1500000원)- 0개 
5개 일치, 보너스 볼 일치(30000000원) - 0개 
6개 일치 (2000000000원)- 0개
총 수익률은 30%입니다.
```