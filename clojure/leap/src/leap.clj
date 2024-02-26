(ns leap)

(defn leap-year? [year] ;; <- argslist goes here
  (if (= 0 (mod year 100))
    (if (= 0 (mod year 400)) true false)
    (if (= 0 (mod year 4)) true false)
  )      
)
