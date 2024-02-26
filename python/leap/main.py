def leap_year(year: int) -> bool:
    if year % 100 == 0:
        return year % 400 == 0
    return year % 4 == 0
