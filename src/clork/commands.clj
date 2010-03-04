(ns clork.commands
	(:use clork.player))

(defn look
	[]
		(look rooms (:location the-player))
	[rooms room]
		(:description (room rooms)))

(defn move [rooms from direction]
  (direction (:exits (rooms from))))

(defn move-player [a-player rooms direction]
  (let [new-room (move rooms (:location a-player) direction)]
    (if new-room (struct player new-room) a-player) ))

