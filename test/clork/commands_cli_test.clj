
(ns clork.commands-cli-test
	(:use clojure.test clork.clork clork.data))
	
(deftest should-use-the-default-player-and-map-when-looking
	(let [expected-description (:description (:hall rooms))]
		(is(= expected-description (look)))))

(deftest should-have-compass-directions-as-functions
	(let [functions (ns-interns 'clork.clork)]
		(dorun
		(for [direction ['north 'south 'west 'east]]
		(is(contains? functions direction ))))))

