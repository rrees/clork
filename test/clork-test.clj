
(ns clork.test
	(:use clojure.test clork.commands-test clork.commands-cli-test))


(run-tests 'clork.commands-test 'clork.commands-cli-test)