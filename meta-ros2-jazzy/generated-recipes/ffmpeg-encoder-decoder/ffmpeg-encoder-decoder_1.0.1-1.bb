# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "ROS2 convenience wrapper around ffmpeg for encoding/decoding"
AUTHOR = "Bernd Pfrommer <bernd.pfrommer@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache2"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=c93e37fc0c6f510db5735eb91dcc1550"

ROS_CN = "ffmpeg_encoder_decoder"
ROS_BPN = "ffmpeg_encoder_decoder"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libavdevice-dev} \
    cv-bridge \
    ffmpeg \
    opencv \
    rclcpp \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    ament-cmake-ros-native \
    pkgconfig-native \
    ros-environment-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libavdevice-dev} \
    cv-bridge \
    ffmpeg \
    opencv \
    rclcpp \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libavdevice-dev} \
    cv-bridge \
    ffmpeg \
    opencv \
    rclcpp \
    sensor-msgs \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-clang-format \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/ffmpeg_encoder_decoder-release/archive/release/jazzy/ffmpeg_encoder_decoder/1.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/ffmpeg_encoder_decoder"
SRC_URI = "git://github.com/ros2-gbp/ffmpeg_encoder_decoder-release;${ROS_BRANCH};protocol=https"
SRCREV = "d0a55a82d0c309e26dcaef7875ed6407df214807"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
