//
//  ContentView.swift
//  weatherAppIOS
//
//  Created by Antony Denis Okilipa on 10/10/2021.
//

import shared
import SwiftUI

struct ContentView: View {
    var body: some View {
        ZStack(alignment: .topTrailing){
            Color("SurfaceColor")
                .edgesIgnoringSafeArea(.all)
            
            Circle()
                .fill( LinearGradient(gradient: Gradient(colors: [Color("Yellow"), Color("Pink")]), startPoint: .topLeading, endPoint: .bottomTrailing))
                .frame(width: 200, height: 200, alignment: .topTrailing)
                .shadow(radius: 20)
            
            VStack(alignment:.leading){
                
                
                VStack(alignment: .leading, spacing: 10){
                        Text("San Fransisco").font(.system(size: 18, weight: .regular, design: .default))
                            .foregroundColor(Color("PrimaryText"))
                        
                        Text("18°").font(.system(size: 72, weight: .regular, design: .default))
                            .foregroundColor(Color("PrimaryText"))
                        
                        Text("Cloudy").font(.system(size: 18, weight: .regular, design: .default))
                            .foregroundColor(Color("PrimaryText"))
                            .frame(width: 100, height: 40, alignment: Alignment.center)
                            .background(Color(white: 0.8745))
                            .clipShape(Capsule())
                    }.padding(.bottom,40)

                
                HStack{
                    StatsView(value:"13%", imageName: "drop")
                    StatsView(value:"0.533 mBar", imageName: "gauge")
                    StatsView(value:"9km/h", imageName: "wind")
                
                }.frame(maxWidth: .infinity,alignment: .center)
                    .padding(.bottom, 40)
                
                
                VStack(alignment: .leading, spacing: 24){
                    Text("Today").font(.system(size: 18, weight: .regular, design: .default))
                        .foregroundColor(Color("PrimaryText"))
                    HStack(spacing: 20){
                        WeatherHourlyView(timeOfDay: "10 AM", imageName: "cloud.fill", temperature: 76)
                        WeatherHourlyView(timeOfDay: "10 AM", imageName: "cloud.fill", temperature: 76)
                        WeatherHourlyView(timeOfDay: "10 AM", imageName: "cloud.fill", temperature: 76)
                        WeatherHourlyView(timeOfDay: "10 AM", imageName: "cloud.fill", temperature: 76)
                        WeatherHourlyView(timeOfDay: "10 AM", imageName: "cloud.fill", temperature: 76)
                    }
                }.frame(maxWidth: .infinity)
                    .padding(.bottom, 40)
                
                VStack{
                    WeatherDayView(day: "Tuesday", imageName: "cloud.sun.fill", highestTemp: 19, lowestTemp: 17)
                    WeatherDayView(day: "Wednesday", imageName: "cloud.sun.fill", highestTemp: 19, lowestTemp: 17)
                    WeatherDayView(day: "Thursday", imageName: "cloud.sun.fill", highestTemp: 19, lowestTemp: 17)
                    WeatherDayView(day: "Friday", imageName: "cloud.sun.fill", highestTemp: 19, lowestTemp: 17)
                    WeatherDayView(day: "Saturday", imageName: "cloud.sun.fill", highestTemp: 19, lowestTemp: 17)
                }
                
                Spacer()
                
            }
            .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
            .padding()
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}

struct WeatherHourlyView: View {
    var timeOfDay: String
    var imageName: String
    var temperature: Int
    
    var body: some View {
        VStack(alignment: .center, spacing: 8){
            Text(timeOfDay).font(.system(size: 16, weight: .regular, design: .default))
                .foregroundColor(Color("PrimaryText"))
            Image(systemName: imageName)
                .renderingMode(.template)
                .resizable()
                .aspectRatio(contentMode: .fit)
                .foregroundColor(Color("PrimaryText"))
                .frame(width: 32, height: 32)
            Text("\(temperature)°").font(.system(size: 24, weight: .regular, design: .default))
                .foregroundColor(Color("PrimaryText"))
        }.frame(maxWidth: .infinity)
    }
}


struct WeatherDayView: View {
    
    var day: String
    var imageName: String
    var highestTemp: Int
    var lowestTemp: Int
    
    var body: some View{
        HStack(spacing: .pi){
            Text(day).font(.system(size: 16, weight: .regular, design: .default))
                .foregroundColor(Color("PrimaryText"))
                .frame(maxWidth: .infinity, alignment: .leading)
            Image(systemName: imageName)
                .renderingMode(.template)
                .resizable()
                .aspectRatio(contentMode: .fit)
                .foregroundColor(Color("PrimaryText"))
                .frame(maxWidth: .infinity, maxHeight: 24)
            Text("\(highestTemp)°").font(.system(size: 18, weight: .regular, design: .default))
                .foregroundColor(Color("PrimaryText"))
                .padding(.horizontal, 10)
            
            Text("\(lowestTemp)°").font(.system(size: 18, weight: .regular, design: .default))
                .foregroundColor(Color("PrimaryText"))
                .padding(.horizontal, 10)
        }.frame(maxWidth: .infinity, alignment: .center)
    }
}



struct StatsView: View {
    var value: String
    var imageName: String
    
    var body: some View {
        HStack(spacing:5){
            Image(systemName: imageName)
                .foregroundColor(Color("PrimaryText"))
            
            Text(value).font(.system(size: 16, weight: .regular, design: .default))
                .foregroundColor(Color("PrimaryText"))
        }.frame(maxWidth: .infinity)
    }
}

