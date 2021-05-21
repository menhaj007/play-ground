require "pry"

require_relative "models/doctor"
require_relative "models/patient"
require_relative "models/appointment"

doctor1 = Doctor.new("Ken Jeong", "CSC", "INNOVA")
doctor2 = Doctor.new("Kim Thuang", "CSC", "INNOVA")
doctor3 = Doctor.new("Mike Barry", "CSC", "INNOVA")

pat1 = Patient.new("Jack", 21)
pat2 = Patient.new("Chan", 31)
pat3 = Patient.new("Jackson", 25)
pat4 = Patient.new("Arthor", 35)

appt1 = Appointment.new("2019/10/02", "12:00 am", "headach", doctor1, pat1)
appt2 = Appointment.new("2019/10/02", "12:00 am", "headach", doctor2, pat3)
appt3 = Appointment.new("2019/10/02", "12:00 am", "headach", doctor3, pat2)
appt4 = Appointment.new("2019/10/02", "12:00 am", "headach", doctor1, pat4)




binding.pry
