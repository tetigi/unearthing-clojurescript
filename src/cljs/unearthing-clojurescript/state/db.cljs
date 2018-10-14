(ns unearthing-clojurescript.state.db
  (:require [cljs.spec.alpha :as s]
            [re-frame.core :as re-frame]))

(s/def ::token string?)
(s/def ::db (s/keys :opt-un [::token]))

(def default-db
  {:token nil})
