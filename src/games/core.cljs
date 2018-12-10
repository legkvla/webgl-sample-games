(ns games.core
  (:require [games.engine :as engine]
            [games.flood-control.core         :as flood-control]
            [games.asteroid-belt-assault.core :as asteroid-belt-assault]
            [games.robot-rampage.core         :as robot-rampage]
            [games.gemstone-hunter.core       :as gemstone-hunter]
            [games.gemstone-hunter.editor]))

(enable-console-print!)

(flood-control/init)

(defn ^:export start []  (engine/run))
