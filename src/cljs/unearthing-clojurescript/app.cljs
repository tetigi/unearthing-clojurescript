(ns unearthing-clojurescript.app
<<<<<<< Updated upstream
  (:require [unearthing-clojurescript.login :as login]))
=======
  (:require [ensorcel.conjure :as conjure :refer [call->]]
            [example.api :as api]))
>>>>>>> Stashed changes

(def client (conjure/client api/spellbook :widgets
                            :port 8000))

(call-> (client :get-all)
        println)

(call-> (client :get {:id 1})
        println)

(defn component
  []
  [:div
    [login/component #(println %1 %2)]])
