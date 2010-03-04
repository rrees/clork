(ns clork.clork
	(:use :reload-all clork.data clork.player clork.commands))

(def the-player (atom (struct player :hall)))

(defn move-to [direction]
	  (swap! the-player #(move-player % rooms direction))
	  (println (look rooms (:location @the-player))))

;; Meta-program all the movement functions
(doall
	(map #(intern *ns* %1 (fn [] (move-to %2))) ['north 'east 'south 'west] [:n :e :s :w])
)


    
