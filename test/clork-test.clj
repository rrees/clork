
(ns clork.test
	(:use clojure.test clork))

(def test-map
	{:start-room {:exits {:e :east-room}}
	:east-room {:exits {:w :start-room}}})

(deftest move-test
	(is (= (move test-map {:location :start-room} :e))))

(run-tests 'clork.test)