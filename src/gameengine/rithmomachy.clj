(ns gameengine.rithmomachy)

;; (def rithmomachy-board (Game.
;;                         :rithmomachy
;;                         {[1 1] (GamePiece. :blue :square 25),
;;                          [1 2] (GamePiece. :blue :square 81),
;;                          [1 7] (GamePiece. :blue :square 169),
;;                          [1 8] (GamePiece. :blue :square 289),
;;                          [2 1] (GamePiece. :blue :square 15),
;;                          [2 2] (GamePiece. :blue :square 45),
;;                          [2 3] (GamePiece. :blue :triangle 25),
;;                          [2 4] (GamePiece. :blue :triangle 20),
;;                          [2 5] (GamePiece. :blue :triangle 42),
;;                          [2 6] (GamePiece. :blue :triangle 49),
;;                          [2 7] (GamePiece. :blue :pyramid 91),
;;                          [2 8] (GamePiece. :blue :square 153),
;;                          [3 1] (GamePiece. :blue :triangle 9),
;;                          [3 2] (GamePiece. :blue :triangle 6),
;;                          [3 3] (GamePiece. :blue :circle 4),
;;                          [3 4] (GamePiece. :blue :circle 16),
;;                          [3 5] (GamePiece. :blue :circle 36),
;;                          [3 6] (GamePiece. :blue :circle 64),
;;                          [3 7] (GamePiece. :blue :triangle 72),
;;                          [3 8] (GamePiece. :blue :triangle 81),
;;                          [4 3] (GamePiece. :blue :circle 2),
;;                          [4 4] (GamePiece. :blue :circle 4),
;;                          [4 5] (GamePiece. :blue :circle 6),
;;                          [4 6] (GamePiece. :blue :circle 8),
;;                          [13 3] (GamePiece. :red :circle 9),
;;                          [13 4] (GamePiece. :red :circle 7),
;;                          [13 5] (GamePiece. :red :circle 5),
;;                          [13 6] (GamePiece. :red :circle 3),
;;                          [14 1] (GamePiece. :red :triangle 100),
;;                          [14 2] (GamePiece. :red :triangle 90),
;;                          [14 3] (GamePiece. :red :circle 81),
;;                          [14 4] (GamePiece. :red :circle 49),
;;                          [14 5] (GamePiece. :red :circle 25),
;;                          [14 6] (GamePiece. :red :circle 9),
;;                          [14 7] (GamePiece. :red :triangle 12),
;;                          [14 8] (GamePiece. :red :triangle 16),
;;                          [15 1] (GamePiece. :red :pyramid 190),
;;                          [15 2] (GamePiece. :red :square 120),
;;                          [15 3] (GamePiece. :red :triangle 64),
;;                          [15 4] (GamePiece. :red :triangle 56),
;;                          [15 5] (GamePiece. :red :triangle 30),
;;                          [15 6] (GamePiece. :red :triangle 36),
;;                          [15 7] (GamePiece. :red :square 66),
;;                          [15 8] (GamePiece. :red :square 28),
;;                          [16 1] (GamePiece. :red :square 361),
;;                          [16 2] (GamePiece. :red :square 225),
;;                          [16 7] (GamePiece. :red :square 121),
;;                          [16 8] (GamePiece. :red :square 49)}
;;                         {:x 16 :y 8}
;;                         {:circle '([-1 -1] [-1 1] [1 -1] [1 1]),
;;                          :triangle '([2 0] [-2 0] [0 2] [0 -2]
;;                                      [2 1] [2 -1] [-2 1] [-2 -1]
;;                                      [1 2] [-1 2] [1 -2] [-1 -2]),
;;                          :square '([3 0] [-3 0] [0 3] [0 -3]
;;                                    [3 1] [3 -1] [-3 1] [-3 -1]
;;                                    [1 3] [-1 3] [1 -3] [-1 -3])}))
