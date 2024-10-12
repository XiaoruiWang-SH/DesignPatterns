package org.example.adapter;

public class TemperatureAdapter implements Temperature {

    private final FahrenheitTemperature f;

    private String unit;

    public TemperatureAdapter(FahrenheitTemperature f) {
        this.f = f;
    }

    @Override
    public double temperature() {
        switch (unit) {
            case "C" -> {
                return fToC(f.temperature());
            }
            case "F" -> {
                return f.temperature();
            }
        }
        return 0;
    }

    @Override
    public void setUnit(String unit) {
        this.unit = unit;
    }

    private double fToC(double f) {
        return f - 50;
    }
}
