(ns clork.clork)

(def rooms {:hall {:description "A large vaulted hall"
                   :exits {:n :kitchen
                           :w :lounge}}
            :kitchen {:description "A kitchen with a roaring fire"
                      :exits {:s :hall}}
            :lounge {:description "A lounge with a red chez longue"
                     :exits {:e :hall}}})

(defn look [rooms room]
  (:description (room rooms)))

(defn move [rooms from direction]
  (direction (:exits (rooms from))))

(defstruct player :location)

(defn move-player [a-player rooms direction]
  (let [new-room (move rooms (:location a-player) direction)]
    (if new-room (struct player new-room) a-player) ))


(def the-player (atom (struct player :hall)))

(defn move-to [direction]
  (swap! the-player #(move-player % rooms direction))
  (println (look rooms (:location @the-player))))


;; Meta-program all the movement functions
(doall
	(map #(intern 'clork.clork %1 (fn [] (move-to %2))) ['north 'east 'south 'west] [:n :e :s :w])
)
    
