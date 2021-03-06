
(ns clork.commands-test
	(:use clojure.test clork.commands clork.player))

(def test-map
	{:start-room
		{:description "Start"
		:exits {:e :east-room}}
	:east-room {:exits {:w :start-room}}})

(deftest move-test
	(is (= (move test-map {:location :start-room} :e))))

(deftest look-test
	(let [expected-description (:description (:start-room test-map))]
	(is (= expected-description (look-at test-map :start-room)))))
