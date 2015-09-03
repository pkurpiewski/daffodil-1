(ns gameengine.checkers
  (:import [gameengine.games
            Game
            GamePiece
            GameRules]))

;; Checkers pieces
(def black-piece (GamePiece. :black :man :checkers nil))
(def white-piece (GamePiece. :white :man :checkers nil))
(def black-king (GamePiece. :black :king :checkers nil))
(def white-king (GamePiece. :white :king :checkers nil))

;; Checkers rules
(def checkers-rules
  "Data structure that contains a set of movement rules for the game of checkers.
  This only defines the way in which pieces can move, and nothing about victory
  conditions as it stands. To be implemented later. These are currently \"extra-rules\"
  but may be redefined in the future. This example rule-set has a value of nil for extra-rules"
  (GameRules. {:king '([-1 -1] [-1 1] [1 -1] [1 1]),
                                 :man {:white '([-1 -1] [-1 1]),
                                       :black '([1 -1] [1 1])}}
                                nil))

;; Map of a populated, initial state checkers board.
(def checkers-board (into (sorted-map) {[0 1] black-piece,
                                        [0 3] black-piece,
                                        [0 5] black-piece,
                                        [0 7] black-piece,
                                        [1 0] black-piece,
                                        [1 2] black-piece,
                                        [1 4] black-piece,
                                        [1 6] black-piece,
                                        [2 1] black-piece,
                                        [2 3] black-piece,
                                        [2 5] black-piece,
                                        [2 7] black-piece,
                                        [5 0] white-piece,
                                        [5 2] white-piece,
                                        [5 4] white-piece,
                                        [5 6] white-piece,
                                        [6 1] white-piece,
                                        [6 3] white-piece,
                                        [6 5] white-piece,
                                        [6 7] white-piece,
                                        [7 0] white-piece,
                                        [7 2] white-piece,
                                        [7 4] white-piece,
                                        [7 6] white-piece}))

;; An initial state checkers game object.
(def checkers (Game.
               :checkers
               checkers-board
               {:x 8, :y 8}
               checkers-rules))
