
(ns clork.commands-cli-test
	(:use clojure.test clork.clork clork.data))
	
(deftest should-use-the-default-player-and-map-when-looking
	(let [expected-description (:description (:hall rooms))]
		(is(= expected-description (look)))))

