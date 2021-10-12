# 자동차 경주 게임

## 진행 방법

* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정

* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 구현 내용

* Car
  * 이름은 5자 이하
* Cars
  * List\<Car>
* Step
  * 0 - 9 사이의 값
  * 4 이상 전진
  * 3 이하 멈춤
* RacingCar
  * Map<Car, Step>
* RacingCars
  * List\<RacingCar>
* RacingGameController
  * 게임 시작
  * 게임 종료
* InputView
  * 자동차 이름 받기
  * 시도할 횟수 받기
* OutputView
  * 실행 결과 출력
  * 최종 우승자 출력